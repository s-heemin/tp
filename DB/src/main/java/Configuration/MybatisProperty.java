package Configuration;

public class MybatisProperty {
    public static String fetchString(String host, String username, String password) {
        var target = String.format("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "    <!DOCTYPE configuration\n" +
                "    PUBLIC \"-//mybatis.org//DTD Config 3.0//EN\"\n" +
                "    \"http://mybatis.org/dtd/mybatis-3-config.dtd\">\n" +
                "<configuration>\n" +
                "    <environments default=\"development\">\n" +
                "        <environment id=\"development\">\n" +
                "            <transactionManager type=\"JDBC\"/>\n" +
                "            <dataSource type=\"POOLED\">\n" +
                "                <property name=\"driver\" value=\"com.mysql.jdbc.Driver\"/>\n" +
                "                <property name=\"url\" value=\"jdbc:mysql://%s:3306/dev\"/>\n" +
                "                <property name=\"username\" value=\"%s\"/>\n" +
                "                <property name=\"password\" value=\"%s\"/>\n" +
                "            </dataSource>\n" +
                "        </environment>\n" +
                "    </environments>\n" +
                "</configuration>", host, username, password);
        return target;
    }
}
