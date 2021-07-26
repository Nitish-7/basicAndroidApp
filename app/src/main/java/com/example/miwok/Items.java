package com.example.miwok;

public class Items {
    private String mEnglishWord;
    private String mMiwokWord;
    private int mImageSourceId;
    private int mMediaSourceId;

    public Items(String EnglishWord, String MiwokWord, int ImageSourceId, int MediaSourceId) {
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
        mImageSourceId = ImageSourceId;
        mMediaSourceId = MediaSourceId;
    }

    public Items(String EnglishWord, String MiwokWord, int MediaSourceId) {
        mEnglishWord = EnglishWord;
        mMiwokWord = MiwokWord;
        mMediaSourceId = MediaSourceId;
    }

    public String getEnglishWord() {

        return mEnglishWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImageSourceId() {
        return mImageSourceId;
    }

    public int getMediaSourceId() {
        return mMediaSourceId;
    }

}
