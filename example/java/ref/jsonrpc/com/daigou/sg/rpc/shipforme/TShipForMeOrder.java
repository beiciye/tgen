package com.daigou.sg.rpc.shipforme;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TShipForMeOrder extends BaseModule<TShipForMeOrder> implements Serializable {
    public int id;
    public String orderNumber;
    public String shipperName;
    public String wayBill;
    public String alternative;
    public String warehouseCode;
    public int arrivedDays;
    public double weight;
    public double volumeWeight;
    public double unitPrice;
    public boolean hasPhotoService;
    public boolean hasRepackService;
    public boolean hasOtherService;
    public boolean isProcessing;
    public ArrayList<TVendorName> vendorNames;
    public String correctVendorName;
    public double valueAddedCharge;
    public String orderStatus;
    public String attachments;
    public String valueAddedService;
    public String repackService;
    public ArrayList<TOrderRemark> remarks;
}
