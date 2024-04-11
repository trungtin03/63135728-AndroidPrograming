package tiil.edu.recyclerview;

public class LandScape {
    String landImageFilename;
    String landCaption;

    public LandScape(String landImageFilename, String landCaption) {
        this.landImageFilename = landImageFilename;
        this.landCaption = landCaption;
    }

    public String getLandImageFilename() {
        return landImageFilename;
    }

    public void setLandImageFilename(String landImageFilename) {
        this.landImageFilename = landImageFilename;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
