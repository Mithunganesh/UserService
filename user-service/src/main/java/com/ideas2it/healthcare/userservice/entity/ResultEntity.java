package com.ideas2it.healthcare.userservice.entity;

public class ResultEntity {
    boolean result;

    public ResultEntity(){}
    public ResultEntity(boolean result) {
        this.result = result;
    }

    public ResultEntity(ResultEntityBuilder resultEntityBuilder) {
        this.result = resultEntityBuilder.result;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
    public static class ResultEntityBuilder{
        boolean result;

        public ResultEntityBuilder result(boolean result){
            this.result = result;
            return this;
        }

        public ResultEntity build(){
            ResultEntity resultEntity = new ResultEntity(this);
            return resultEntity;
        }
    }
}
