package sample.model;


import sample.exceptions.InvalidPriceException;

abstract class TowHitch extends CarComponent {
    public TowHitch() {
        if (!PriceValidator.price(getPrice())) {
            throw new InvalidPriceException();
        } else setPrice(getPrice());
    }
}
