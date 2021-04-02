package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    public CurrencyType currencyType;

    public CanadianDollar() {
        currencyType = CurrencyType.CANADIAN_DOLLAR;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.currencyType.getRate();
    }

    public CurrencyType getTypeOfCurrency() {
        return this.currencyType;
    }

}
