package org.example.testy_jednostkowe;

public class DoseCalculator {

    // Method for calculating the corrected dose of medicine based on the corrected formula
    public double calculateYoungDose(double adultDose, double childAgeInYears) {
        // Ensure the division is done before multiplying by adultDose
        double factor = childAgeInYears / (childAgeInYears + 12);
        double correctedDose = adultDose * factor;

        return correctedDose;
    }

    public double calculateClarksRule(double adultDose, double childWeight){
        return (adultDose * childWeight) / 68.0;

    }

    public double calculateFriedsRure(double childAgeInMonths, double adultDose){
        return (childAgeInMonths * adultDose) / 150.0;
    }

}