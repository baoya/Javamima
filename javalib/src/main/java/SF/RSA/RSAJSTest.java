package SF.RSA;

import org.junit.Test;

/**
 * 项目名称：JavaText
 * 类描述：单元测试类
 * 创建人：xuguoxi
 * 创建时间：2017/5/26 11:21
 * 修改人：xuguoxi
 * 修改时间：2017/5/26 11:21
 * 修改备注：
 */
public class RSAJSTest {
    //需要加密的数据
    String data = "D1";
    //RSA获取的的模
    String mod = "11649069847364846818672367642754943720816994" +
            "7186607406832177081717346095645285899359352541318" +
            "9299620107814259539780744760225555738772486564810" +
            "5822076718793081206769252601329953949337256261150" +
            "8000072694990320730782962666631701171822716436366" +
            "6487426665507898267433561818389745249470203766466" +
            "91051450571808441767";
    //RSA的公钥指数
    String pubkeyzs = "65537";
    @Test
    public void priKeyJiaMi() throws Exception {
        String prikey = "14820627185761950161601873965132783121621694914963037035059470335218758037297920699120824717598273086132955881475642537514321198330538463734059591448446111160459710254250658507144297841775019336335328609170644626341122928036074867320002427422573189665173929984825723327989366602330961198972248865795970196833";
        String mi = RSAJS.PriKeyJiaMi(data,mod,prikey);
        System.out.println(mi);
    }
    @Test
    public void pubKeyJieMi() throws Exception {
        //解密数据从上面的priKeyJiaMi数据得到
        String MiData = "Lajb/voxNM6DzpRLkbwfsnFzintnMV8JwD+LwWRx+/7Gv75k99ss3btBkz9pEPFfphK1Hrqi8S18xSzqKeYDbhIomFMu6zsL/y1rozwEnugfBRFP6uTWmt02wbLqWn85k0gzuA2/Pd/YFtvQe8lZNqzKvPIBbVdU3Li/bTnYP/w=";
        String ming = RSAJS.PubKeyJieMi(MiData,mod,pubkeyzs);
        System.out.println(ming);
    }

    @Test
    public void PubKeyJiaMi() throws Exception {
        String mi = RSAJS.PubKeyJiaMi(data,mod,pubkeyzs);
        System.out.println(mi);
    }

    @Test
    public void PriKeyJieMi() throws Exception {
        //解密数据从上面的PubKeyJiaMi数据得到
        String MiData = "14511865A8DC5CEAB220C8B42DE7E24651189AD791BAB3ED0DD48FD89A05BDE95497EE32DEA16F0AFF4E5870A2884ABFC67368F87E85BD4CEE0AEDC4094BA647889DB310158C7F3BE9140D49CCEBD471087FEE41992752ACA7C060A1482AE5AED2A43C3040C3D6B44E65652A0C4FED2A1B56A5CBD5D5F4D1F19BA71973A0196C";
        String prikey = "14820627185761950161601873965132783121621694914963037035059470335218758037297920699120824717598273086132955881475642537514321198330538463734059591448446111160459710254250658507144297841775019336335328609170644626341122928036074867320002427422573189665173929984825723327989366602330961198972248865795970196833";
        String ming = RSAJS.PriKeyJieMi(MiData,mod,prikey);
        System.out.println(ming);
    }

}