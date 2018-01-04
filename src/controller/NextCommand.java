package controller;

import ui.ImageDisplay;

public class NextCommand implements Command{

    private final ImageDisplay imageDislay;

    public NextCommand(ImageDisplay imageDislay) {
        this.imageDislay = imageDislay;
    }

    @Override
    public String name() {
        return "next";
    }

    @Override
    public void execute() {
        imageDislay.display(imageDislay.currentImage().next());
    }
}

