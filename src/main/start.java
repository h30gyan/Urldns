package main;


public class start {

	public static void main(String[] args) {
    	System.out.println("\r\n�˹��߽���dnslog©�����ԣ��������ڷǷ���;������������ϵsonomon@126.com\r\n");
    	//String[] args = {"ldap","ognl.OgnlContext","27e7e4c7.dns.1433.eu.org"};
    	if (args.length == 3){
    		if (args[0].equals("base64")|args[0].equals("file")|args[0].equals("ldap")){
    			try {
					en.main(args[0], args[1], args[2]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else {
				error("���󣡣�����һ������ֻ������base64����file����ldap");
			}
    	} else {
    		error("���󣡣���������������");
		}
	}
	private static void error(String eString) {
		System.out.println(eString+"\r\n");
    	System.out.println("������ģʽ��base64��file��ldap��fileĬ�ϵ�ǰĿ¼�����ļ�1.ser��ldapĬ�϶˿�1389��\r\n"
    			+ "������: java -jar Urldns.jar base64 all dnslog.com\r\n"
    			+ "����   : java -jar Urldns.jar file all dnslog.com\r\n"
    			+ "����   : java -jar Urldns.jar ldap all dnslog.com\r\n"
    			+ "\r\n"
    			+ "Ŀǰ֧�ֵ�����̽�������£�ʹ��all��ȫ��̽�⣬���Խ�all�滻Ϊ���¼�д���е���̽�⣬Ҳ������д�Զ���������̽�⡣�����ͬʱ̽�����࣬��|�ָ\r\n"
    			+ "CommonsCollections13567\r\n"
    			+ "CommonsCollections24\r\n"
    			+ "CommonsBeanutils2\r\n"
    			+ "C3P0\r\n"
    			+ "AspectJWeaver\r\n"
    			+ "bsh\r\n"
    			+ "Groovy\r\n"
    			+ "Becl\r\n"
    			+ "Jdk7u21\r\n"
    			+ "JRE8u20\r\n"
    			+ "winlinux\r\n"
    			+ "ʹ��ldapģʽ��all������̽������\r\n"
    			+ "BeanFactory,����޲ι���͵�String����RCE"
    			+ "org.apache.naming.factory.BeanFactory\r\n"
    			+ "javax.el.ELProcessor\r\n"
    			+ "groovy.lang.GroovyShell\r\n"
    			+ "groovy.lang.GroovyClassLoader\r\n"
    			+ "org.yaml.snakeyaml.Yaml\r\n"
    			+ "com.thoughtworks.xstream.XStream\r\n"
    			+ "org.xmlpull.v1.XmlPullParserException\r\n"
    			+ "org.xmlpull.mxp1.MXParser\r\n"
    			+ "org.mvel2.sh.ShellSession\r\n"
    			+ "com.sun.glass.utils.NativeLibLoader\r\n"
    			+ "XXE���������̵��ļ�д��\r\n"
    			+ "org.apache.catalina.UserDatabase\r\n"
    			+ "org.apache.catalina.users.MemoryUserDatabaseFactory\r\n"
    			+ "h2 RCE\r\n"
    			+ "org.h2.Driver\r\n"
    			+ "org.apache.tomcat.dbcp.dbcp.BasicDataSourceFactory\r\n"
    			+ "org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory\r\n"
    			+ "org.apache.commons.dbcp.BasicDataSourceFactory\r\n"
    			+ "org.apache.commons.pool.KeyedObjectPoolFactory"
    			+ "org.apache.commons.dbcp2.BasicDataSourceFactory\r\n"
    			+ "org.apache.commons.pool2.PooledObjectFactory"
    			+ "org.apache.tomcat.jdbc.pool.DataSourceFactory\r\n"
    			+ "com.alibaba.druid.pool.DruidDataSourceFactory\r\n"
    			+ "WebSphere����jar RCE\r\n"
    			+ "com.ibm.ws.client.applicationclient.ClientJ2CCFFactory\r\n"
    			+ "com.ibm.ws.webservices.engine.client.ServiceFactory\r\n"
    			+ "\r\n"
    			+ "ʾ��: java -jar Urldns.jar base64 \"CommonsBeanutils2|C3P0|ognl.OgnlContext\" dnslog.com\r\n"
    			+ "ldapģʽ֧��ldap://2.2.2.2:1389/jndi�������ٷ����л�����Զ�̼���class����̽���Ƿ����");
	}
}
