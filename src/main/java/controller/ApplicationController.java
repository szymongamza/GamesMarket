package controller;

import service.*;

public final class ApplicationController {

    private AdminService adminService;
    private ItemService itemService;
    private OrderService orderService;
    private AuctionService auctionService;
    private CustomerService customerService;
    private AddressService addressService;

    //Singleton pattern
    private static ApplicationController applicationControllerInstance;

    private ApplicationController(){
        this.adminService = new AdminService();
        this.itemService = new ItemService();
        this.orderService = new OrderService();
        this.auctionService = new AuctionService();
        this.customerService = new CustomerService();
        this.addressService = new AddressService();
    }

    public static ApplicationController getInstance(){
        if (applicationControllerInstance == null){
            applicationControllerInstance = new ApplicationController();
        }
        return applicationControllerInstance;
    }

}
