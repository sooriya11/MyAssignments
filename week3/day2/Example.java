package week3.day2;

public class Example {
	// Base Class: WebElement
	class WebElement {
	    public void click() {
	        System.out.println("Element clicked");
	    }

	    public void setText(String text) {
	        System.out.println("Text set: " + text);
	    }
	}

	// Subclass: Button
	class Button extends WebElement {
	    public void submit() {
	        System.out.println("Button submitted");
	    }
	}

	// Subclass: TextField
	class TextField extends WebElement {
	    public String getText() {
	        return "Sample Text";
	    }
	}

	// Additional Subclass: CheckBoxButton
	class CheckBoxButton extends Button {
	    public void clickCheckButton() {
	        System.out.println("CheckBoxButton clicked");
	    }
	}

	// Another Subclass: RadioButton
	class RadioButton extends Button {
	    public void selectRadioButton() {
	        System.out.println("RadioButton selected");
	    }
	}

	// Execution Class: Elements
	public class Elements {
	    public void main(String[] args) {
	        // Create instances and demonstrate functionality
	        Button submitButton = new Button();
	        submitButton.click();
	        submitButton.submit();

	        TextField textField = new TextField();
	        textField.setText("Hello");
	        System.out.println("Text from TextField: " + textField.getText());

	        CheckBoxButton checkBoxButton = new CheckBoxButton();
	        checkBoxButton.clickCheckButton();

	        RadioButton radioButton = new RadioButton();
	        radioButton.selectRadioButton();
	    }
	}


}
