package controller;

import ui.ImageDisplay;

public class PreviousCommand implements Command {
    private final ImageDisplay imageDislay;

    public PreviousCommand(ImageDisplay imageDislay) {
        this.imageDislay = imageDislay;
    }

    @Override
    public String name() {
        return "prev";
    }

    @Override
    public void execute() {
        imageDislay.display(imageDislay.currentImage().prev());
    }
}

