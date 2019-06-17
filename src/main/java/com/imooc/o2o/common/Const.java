package com.imooc.o2o.common;

public class Const {

    public interface UserStatus{
            int FORBIDDEN_USE =0;
            int ALLOWED_USE = 1;
    }
    public enum userTypeNum{
            CUSTOMER("顾客",1),
            BUSSINESSMAN("商家",2),
            SUPERADMIN("管理员",3);
            private String typeName;
            private int typeCode;
        userTypeNum(String typeName,int typeCode){
                this.typeName = typeName;
                this.typeCode = typeCode;

        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public int getTypeCode() {
            return typeCode;
        }

        public void setTypeCode(int typeCode) {
            this.typeCode = typeCode;
        }
    }
    //头条接口常量
    public interface HeadLineStatus{
        int FORBIDDEN_USE =0;
        int ALLOWED_USE = 1;
    }
    public enum ShopStatusEnum{
            DISABLED("不可用",0),
            REVIEW("审核中",1),
            ENABLE("可用",2);
            private String value;
            private int code;
        ShopStatusEnum(String value,int code){
                this.value=value;
                this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
    public enum ProductStatusEnum{
        OFFSHELF("下架",0),
        ONSHELF("上架",1);
        private String value;
        private int code;
        ProductStatusEnum(String value,int code){
            this.value=value;
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
