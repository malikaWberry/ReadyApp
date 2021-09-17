package kz.malika.ready;

public class Model {
    private String title;
    private float numDiff, numLevel;

    public Model(String mTitle, float mNumDiff, float mNumLevel) {
        title = mTitle;
        numDiff =  mNumDiff;
        numLevel = mNumLevel;
    }

    public String getTitle() {
        return title;
    }

    public float getDiff() {
        return numDiff;
    }

    public float getLevel() {
        return numLevel;
    }

    public void setTitle(String s) {
        title = s;
    }

    public void setDiff(float d) {
        numDiff = d;
    }

    public void setLevel(float l) {
       numLevel = l;
    }
}
