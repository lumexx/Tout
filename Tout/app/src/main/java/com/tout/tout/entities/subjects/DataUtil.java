package com.tout.tout.entities.subjects;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<Subject> generateSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Wikipedia",
                "Free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation"));
        subjects.add(new Subject("Oxford Dictionaries",
                "Dedicated to improving communication through an understanding of, and a passion for, language from around the globe"));
        subjects.add(new Subject("Urban Dictionary",
                "Crowdsourced online dictionary for slang words and phrases"));
        subjects.add(new Subject("Languages",
                "Learn new words and improve your vocabulary "));
        subjects.add(new Subject("Lexigram",
                "Medical terminology"));

        return subjects;
    }
}