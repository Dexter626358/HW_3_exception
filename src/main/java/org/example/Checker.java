package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Checker {
    public boolean isDateValid(String dateString, String pattern)
    {
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            if (sdf.format(sdf.parse(dateString)).equals(dateString))
                return true;
        }
        catch (ParseException pe) {}

        return false;
    }
}
