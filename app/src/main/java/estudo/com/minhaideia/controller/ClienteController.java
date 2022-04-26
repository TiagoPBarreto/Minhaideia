package estudo.com.minhaideia.controller;

import android.util.Log;

import estudo.com.minhaideia.core.AppUtil;

public class ClienteController {

    String versaoApp;
    public ClienteController(){
        //AppUtil.versaoDoAplicativo();
        this.versaoApp= AppUtil.versaoDoAplicativo();

        Log.i(AppUtil.TAG, "ClienteControllere:" +versaoApp);
    }
}
