package com.geely.design.pattern.structural.composite.v2;

import com.geely.design.pattern.structural.composite.CatalogComponent;
import com.geely.design.pattern.structural.composite.Course;
import com.geely.design.pattern.structural.composite.CourseCatalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by geely
 */
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        LOGGER.info("Message from the orcs: ");

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        LOGGER.info("\nMessage from the elves: ");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();



    }
}
