package com.example.du_an_1_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

public class LoginTabFragment extends Fragment {
    TextInputLayout edtLogin,edtPass;
    TextView txtForget;
    Button btnLogin;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        //Anh xa
        edtLogin = root.findViewById(R.id.edtLogin);
        edtPass = root.findViewById(R.id.edtPass);
        btnLogin = root.findViewById(R.id.btn_login);
        txtForget = root.findViewById(R.id.txtForget);

        edtLogin.setTranslationX(800);
        edtPass.setTranslationX(800);
        btnLogin.setTranslationX(800);
        txtForget.setTranslationX(800);

        edtLogin.setAlpha(v);
        edtPass.setAlpha(v);
        btnLogin.setAlpha(v);
        txtForget.setAlpha(v);

        edtLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        edtPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        txtForget.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        btnLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();

        return root;
    }
}
