package com.example.android.seattleguide;

public class Entry
{
    private String mTitle;
    private int mImageResourceId;
    private String mDescription;

    public Entry(String title, String description)
    {
        mTitle = title;
        mDescription = description;
    }

    public Entry(String title, String description, int imageId)
    {
        mTitle = title;
        mImageResourceId = imageId;
        mDescription = description;
    }

    /**
     * Gets the title of the entry
     * @return
     */
    public String getTitle()
    {
        return mTitle;
    }

    /**
     * Gets the image resource ID of the entry
     * @return
     */
    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    /**
     * Get the description of the entry
     * @return
     */
    public String getDescription()
    {
        return mDescription;
    }
}
