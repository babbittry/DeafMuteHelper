package com.ncatz.yeray.deafmutehelper.interfaces;

public interface IMvp {
    interface View {
        void setMessageError(String messageError, int idView);
    }
    interface Presenter {
        void textToSpeech(String text);
    }
}
