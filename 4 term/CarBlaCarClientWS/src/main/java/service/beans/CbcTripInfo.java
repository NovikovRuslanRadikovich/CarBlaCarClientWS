package service.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CbcTripInfo {

    private Long id;

    private CbcDriverInfo driver;

    private  CbcAutoInfo automobile;

    private Date date;

    private int price;

    private int count;

    private String status;

    private String info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CbcDriverInfo getDriver() {
        return driver;
    }

    public void setDriver(CbcDriverInfo driver) {
        this.driver = driver;
    }

    public CbcAutoInfo getAutomobile() {
        return automobile;
    }

    public void setAutomobile(CbcAutoInfo automobile) {
        this.automobile = automobile;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
