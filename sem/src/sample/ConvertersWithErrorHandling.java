package sample;

public class ConvertersWithErrorHandling {

    public static class IntegerStringConverter extends javafx.util.converter.IntegerStringConverter {
        private boolean conversionSuccessful;

        @Override
        public Integer fromString(String s) {
            try {
                Integer result = super.fromString(s);
                conversionSuccessful = true;
                return result;
            } catch(NumberFormatException e) {
                Dialogs.showErrorDialog("Type valid number!");
                conversionSuccessful = false;
                return 0;
            }
        }

        public boolean wasSuccessful() {
            return conversionSuccessful;
        }
    }
}
