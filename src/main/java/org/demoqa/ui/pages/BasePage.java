package org.demoqa.ui.pages;

import org.demoqa.ui.element_helper.FakerGenerator;
import org.demoqa.ui.element_helper.WebElementActions;

public abstract class BasePage {

    protected WebElementActions elementActions = new WebElementActions();

   protected FakerGenerator fakerGenerator = new FakerGenerator();

}
