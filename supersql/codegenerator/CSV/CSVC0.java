package supersql.codegenerator.CSV;

import java.util.Vector;

import supersql.codegenerator.Connector;
import supersql.codegenerator.ITFE;
import supersql.codegenerator.Manager;
import supersql.common.Log;
import supersql.extendclass.ExtList;
import supersql.parser.TFEparser;
//ryuryu

public class CSVC0 extends Connector {

    Manager manager;

    CSVEnv csv_env;
    CSVEnv csv_env2;

    TFEparser tfeps;  //ryuryu

    //コンストラクタ
    public CSVC0(Manager manager, CSVEnv xenv, CSVEnv xenv2) {
        this.manager = manager;
        this.csv_env = xenv;
        this.csv_env2 = xenv2;
    }

    //C0のworkメソ�?��
    public void work(ExtList data_info) {

    	Vector vector_local = new Vector();

    	Log.out("------- C0 -------");
        Log.out("tfes.contain_itemnum=" + tfes.contain_itemnum());
        Log.out("tfes.size=" + tfes.size());
        Log.out("countconnetitem=" + countconnectitem());

        this.setDataList(data_info);

        int i = 0;

        String att;

        //�??タベ�?ス属�?をCSVファイルに明�?
       //if(decos.containsKey("att")){
        //	att = decos.getStr("att");
        	//csv_env.code.append(att + "\n");
        //}

	    //end///////////////////////////////////////////////////////

	   	 while(this.hasMoreItems()) {

		    ITFE tfe = (ITFE)tfes.get(i);

		    String classid = CSVEnv.getClassID(tfe);

		    this.worknextItem(); //�??�?��
		}

	     csv_env.code.append("\n");
	   	 Log.out("TFEId = " + CSVEnv.getClassID(this));
	}

    public String getSymbol() {
        return "CSVC0";
    }

}