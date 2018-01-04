package imageviewer;

import controller.NextCommand;
import controller.PreviousCommand;
import File.FileLoader;
import persistence.ImageLoader;


/**
 *
 * @author: karansainani
 * @group: 2.20(46)
 * 
 * ImageViewerIS2
 */
public class Main {
    public static void main(String[] args) {
        ImageLoader imageLoader = new FileLoader("images");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextCommand(mainFrame.getImageDispalay()));
        mainFrame.add(new PreviousCommand(mainFrame.getImageDispalay()));
        mainFrame.getImageDispalay().display(imageLoader.load());
    }
}
