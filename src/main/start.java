package main;


public class start {

	public static void main(String[] args) {
    	System.out.println("此工具仅能dnslog漏洞测试，不可用于非法用途，有问题请联系sonomon@126.com");
    	//String[] args = {"ldap","ognl.OgnlContext","27e7e4c7.dns.1433.eu.org"};
    	if (args.length == 3){
    		if (args[0].equals("base64")|args[0].equals("file")|args[0].equals("ldap")){
    			try {
					en.main(args[0], args[1], args[2]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				error("错误！！！第一个参数只能输入base64或者file或者ldap");
			}
    	} else {
    		error("错误！！！参数数量不对");
		}
	}
	private static void error(String eString) {
		System.out.println(eString);
    	System.out.println("有三种模式，base64，file，ldap，file默认当前目录生成文件1.ser，ldap默认端口1389。\r\n"
    			+ "请输入: java -jar Urldns.jar base64 all dnslog.com\r\n"
    			+ "或者   : java -jar Urldns.jar file all dnslog.com\r\n"
    			+ "或者   : java -jar Urldns.jar ldap all dnslog.com\r\n"
    			+ "\r\n"
    			+ "目前支持的内置探测类如下，使用all将全部探测，可以将all替换为如下简写进行单独探测，也可以填写自定义的类进行探测。如果想同时探测多个类，用|分割。\r\n"
    			+ "CommonsCollections13567\r\n"
    			+ "CommonsCollections24\r\n"
    			+ "CommonsBeanutils2\r\n"
    			+ "C3P0\r\n"
    			+ "AspectJWeaver\r\n"
    			+ "bsh\r\n"
    			+ "Groovy\r\n"
    			+ "Becl\r\n"
    			+ "Jdk7u21\r\n"
    			+ "winlinux\r\n"
    			+ "使用ldap模式的all将额外探测如下\r\n"
    			+ "javax.el.ELProcessor\r\n"
    			+ "示例: java -jar Urldns.jar base64 \"CommonsBeanutils2|C3P0|ognl.OgnlContext\" dnslog.com\r\n"
    			+ "ldap模式支持ldap://2.2.2.2:1389/jndi，将不再反序列化而是远程加载class，以探测是否出网");
	}
}
