package Lesson2.HW2_2;

public class Workstation extends Laptop{
    Video videoCard;

    public Workstation() {
    }

    public Workstation(int CPUs, int RAM, double monitor, int weight, Video videoCard) {
        super(CPUs, RAM, monitor, weight);
        this.videoCard = videoCard;
    }

    public Video getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(Video videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "videoCard=" + videoCard +
                "} " + super.toString();
    }
}
