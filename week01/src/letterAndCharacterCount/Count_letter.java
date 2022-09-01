package letterAndCharacterCount;

public class Count_letter {
    String s;
    int quality;

    public Count_letter() {
    }

    public Count_letter(String s, int quality) {
        this.s = s;
        this.quality = quality;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return s+"="+quality;
    }

    

}
