package com.springheaven.functional.cost;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CostDetail {

    @Override
    public String toString() {
        return "CostDetail{" +
                "costKey='" + costKey + '\'' +
                ", costCategory='" + costCategory + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", percentage=" + percentage +
                ", costBreakDown=" + costBreakDown +
                '}';
    }

    private String costKey;

    private String costCategory;

    private String category;

    private BigDecimal amount;

    private BigDecimal percentage;


    private List<CostDetail> costBreakDown = new ArrayList<>();


    public String getCategory() {
        return category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public List<CostDetail> getCostBreakDown() {
        return costBreakDown;
    }

    public String getCostKey(){
        return  costKey;
    }

    public void setCostKey(String costKey){
        this.costKey=costKey;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public void setCostBreakDown(List<CostDetail> costBreakDown) {
        this.costBreakDown = costBreakDown;
    }

    public String getCostCategory(){
        return costCategory;
    }

    public void setCostCategory(String costCategory){
        this.costCategory=costCategory;
 }
    public CostDetail(String costKey, String costCategory, String category, BigDecimal amount, BigDecimal percentage, List<CostDetail> costBreakDown) {
        this.costKey = costKey;
        this.costCategory = costCategory;
        this.category = category;
        this.amount = amount;
        this.percentage = percentage;
        this.costBreakDown = costBreakDown;


    }

    public CostDetail(){

        super();

    }

public static class Builder{

        public CostDetail instance;

        public Builder(){
            this(new CostDetail());
        }

    public Builder(CostDetail costDetail) {
            this.instance=costDetail;
    }

    protected Builder copyOf(CostDetail value) {
        this.instance.setCostKey(value.costKey);
        this.instance.setCostCategory(value.costCategory);
        this.instance.setPercentage(value.percentage);
        this.instance.setAmount(value.amount);
        this.instance.setCostBreakDown(value.costBreakDown);
        return this;
    }

    public CostDetail.Builder costKey(String costKey){
        this.instance.costKey=costKey;
        return this;
    }

    public CostDetail.Builder category(String costCategory){
        this.instance.costKey=costCategory;
        return this;
    }

    public CostDetail.Builder percentage(BigDecimal percentage){
        this.instance.percentage=percentage;
        return this;
    }

    public CostDetail.Builder amount(BigDecimal amount){
        this.instance.amount=amount;
        return this;
    }

    public CostDetail.Builder costBreakDown(List<CostDetail> costBreakDown){
        this.instance.costBreakDown=costBreakDown;
        return this;
    }


    public CostDetail build(){
            try{
                return this.instance;
            }finally {
                //ensure that this instnce is not reused
                this.instance=null;
            }
    }

    @Override
    public String toString(){
         return getClass() + "=("+instance+")";
    }
    }

    public static  CostDetail.Builder builder(){
        return new CostDetail().toBuilder();
    }


    public CostDetail.Builder toBuilder(){
        CostDetail.Builder builder= new CostDetail.Builder();
        return builder.copyOf(this);
    }
}
