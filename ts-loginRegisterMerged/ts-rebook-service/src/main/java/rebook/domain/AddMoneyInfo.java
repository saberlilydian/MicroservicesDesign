package rebook.domain;

import javax.xml.ws.soap.Addressing;

/**
 * Created by Administrator on 2017/6/20.
 */
public class AddMoneyInfo {
    private String userId;
    private String money;


    public AddMoneyInfo(){}

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

}
