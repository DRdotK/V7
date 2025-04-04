package com.example.v7;

public class ManagmentViewController {
    //next to main view
    public void onNextManagment() {
        ViewSwitcher.switchTo(View.MAIN);
    }
    //back to initial view
    public void onBackmanagment(){
        ViewSwitcher.switchTo(View.INITIAL);
    }
    //Add goal - Editor
    public void onAddmanagment() {
        ViewSwitcher.switchTo(View.EDITOR);
    }
    //Edit goal - Editor
    public void onEditmanagment() {
        ViewSwitcher.switchTo(View.EDITOR);
    }
}
