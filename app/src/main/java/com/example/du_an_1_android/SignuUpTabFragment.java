package com.example.du_an_1_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SignuUpTabFragment extends Fragment {
    TextInputEditText edtTK, edtMK, edtOTP;
    Button btnSinUp;
    String txtTK, txtMk,txtOPT;
    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;
    TextView otp;

    private TextView mLoginFeedbackText;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    private  String idd;
    FirebaseDatabase db = FirebaseDatabase.getInstance("https://du-an-1-android-75d60-default-rtdb.firebaseio.com/");
    DatabaseReference node = db.getReference("TaiKhoan");
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);
        edtTK = root.findViewById(R.id.edtEmailSinup);
        edtMK = root.findViewById(R.id.passSinup);
        edtOTP = root.findViewById(R.id.edtOTP);
        btnSinUp =  root.findViewById(R.id.btn_signup);
        txtTK = edtTK.getText().toString().trim();
        txtMk = edtMK.getText().toString().trim();
        txtOPT = edtOTP.getText().toString().trim();

        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();

        otp = root.findViewById(R.id.Guiotp);


        mLoginFeedbackText = root.findViewById(R.id.login_form_feedback);

        otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                txtTK = edtTK.getText().toString().trim();

                String complete_phone_number = "+" + "84" + ""+txtTK+"";

                if(txtTK.isEmpty()){
                    mLoginFeedbackText.setText("Vui lòng điền vào biểu mẫu để tiếp tục.");
                    mLoginFeedbackText.setVisibility(View.VISIBLE);
                } else {

                    otp.setEnabled(false);


                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            complete_phone_number,
                            60,
                            TimeUnit.SECONDS,
                            getActivity(),
                            mCallbacks

                    );


                }
            }
        });

        mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {


            @Override
            public void onVerificationFailed(FirebaseException e) {
                mLoginFeedbackText.setText("Mã xác nhận thất bại. Vui lòng thử lại.");
                mLoginFeedbackText.setVisibility(View.VISIBLE);
                otp.setEnabled(true);
            }

            @Override
            public void onCodeSent(final String sid, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(sid, forceResendingToken);


                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                idd = sid;
                            }
                        },
                        3000);
            }

            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {

            }
        };


        btnSinUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtTK = root.findViewById(R.id.edtEmailSinup);
                edtMK = root.findViewById(R.id.passSinup);
                edtOTP = root.findViewById(R.id.edtOTP);
                txtTK = edtTK.getText().toString().trim();
                txtMk = edtMK.getText().toString().trim();
                String otp = edtOTP.getText().toString();

                if(otp.isEmpty()){

                    mLoginFeedbackText.setVisibility(View.VISIBLE);
                    mLoginFeedbackText.setText("Vui lòng điền vào biểu mẫu và thử lại.");

                } else {

                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(idd, otp);
                    signInWithPhoneAuthCredential(credential,txtTK,txtMk);
                }

            }
        });
        return root ;
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential,String tk,String mk) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            sendUserToHome();

                            UUID id = UUID.randomUUID();
                            ThongTinDangNhap thongTinDangNhap = new ThongTinDangNhap();
                            thongTinDangNhap.setId(id.toString());
                            thongTinDangNhap.setTenDangNhap(tk);
                            thongTinDangNhap.setMatKhau(mk);
                            node.child(id.toString()).setValue(thongTinDangNhap);



                            Intent homeIntent = new Intent(getActivity(), MainActivity.class);

                            startActivity(homeIntent);
                        } else {
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                mLoginFeedbackText.setVisibility(View.VISIBLE);
                                mLoginFeedbackText.setText("Sai Mã OTP");
                            }

                            new android.os.Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            mLoginFeedbackText.setVisibility(View.VISIBLE);
                                            mLoginFeedbackText.setText("Đăng kí Thàng Công");
                                        }
                                    },
                                    3000);
                        }
//
                    }
                });
    }
    public void sendUserToHome() {
    }

}
