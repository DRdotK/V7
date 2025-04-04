package com.example.v7;

public enum View {
    INITIAL("Initial-view.fxml"),
    MAIN("main-view.fxml"),
    MANAGMENT("goalManagment-view.fxml"),
    EDITOR("goalEditor-view.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}

