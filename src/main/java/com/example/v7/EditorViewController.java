package com.example.v7;

public class EditorViewController {
    //exit without saving aka Discard
    public void onDiscard() {
        ViewSwitcher.switchTo(View.MANAGMENT);
    }
    //exit with saving aka Save
    public void onSave() {
        ViewSwitcher.switchTo(View.MANAGMENT);
    }
}
