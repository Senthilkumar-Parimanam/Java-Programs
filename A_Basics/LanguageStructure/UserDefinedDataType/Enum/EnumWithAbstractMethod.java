package A_Basics.LanguageStructure.UserDefinedDataType.Enum;

public enum EnumWithAbstractMethod {



    ADD{
        public int operation(int a, int b){
            return a+b;
        }
    },

    MULTIPLY{
        public int operation(int a, int b){
            return a*b;
        }
    };

    public abstract int operation(int a, int b);
    // It will work even if the line 19.

}
