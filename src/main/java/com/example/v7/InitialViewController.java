package com.example.v7;

public class InitialViewController {
    //next to managment view
    public void onNextinitial() {
        ViewSwitcher.switchTo(View.MANAGMENT);
    }
    //quit application

    //Add goal - Editor
    public void onAddinitial() {
        ViewSwitcher.switchTo(View.EDITOR);
    }
}
