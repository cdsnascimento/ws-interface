package model.services;

import model.entities.CarRental;

public class RentalService {
    
    private Double pricePerDay;
    private Double pricePerHour;

    public BrazilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    public void processInvoice(CarRental carRental){
        
    }
}