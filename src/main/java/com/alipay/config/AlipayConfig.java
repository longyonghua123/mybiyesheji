package com.alipay.config;
import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102100731520";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDeOw+gTHg1cobcLZ6wpg7IMArfuWAbEO3hOYKHdam7HVPUJKSJxKfSQh+VsUeaqCT3KqmgyfgAGUmS3qIU1JRVEIKmtgjOwGLcJg4oTSi743XDl8hW50QGwArjIe1waOUyK2be2wNNO5vxwsNu6+GevAIEQwjalnnRJ0MjELdNOJIGxTnDFfUKLZDfN/LhYnb8utEVT+P9cndWdhsXMPaFcaIveDZYNniGI7v9EcnuJW5uT+GemSWaBvmjIHwK+Vs3tG+qdxvWSwMNPNjfa6BVTWbsnRUY9NFxWiFQK92XDSjohVMk/A1RrV/1mji/QW31pNA3opYDUdpNBiWRzKedAgMBAAECggEAfyHiip20lz7xj7w5cG1PP47caaivJkzFCXfRCJVziCv67P4ZcwchytMxJn3IrN1MaGnrqKRiUAwnXvImXyxNv2w2khDJcR32cGME7mFV0EcL8909KxoafJIYqF+cahZYKB9UNmGsvd5AFEqLa0VeSWTc8ns28XXsMo73hXPmqTGGwxhS5Ka2GEd7vNDJOlaWJv9kgIG6mFQgsbIi83aVT8vIo37alF8A9LTKv9tKhjjnA3HULLsLt/IVEGka3hCylICYLvrMEyDJ4yBnYp8uD7OSKrZPKX5SP42VE5xKRdyvnAnnjEGUpbOJi2UkWGezGXOY5JuY8cVDodCAcnwTgQKBgQDzUQ2+vDxgF+M6qlqHpAMCLc5bU4zK8cEJrNH46q5mWmwlWuJIO83rI61QszuqquFtXp7c/hboyXnuKGTLkqrAxO/z/UnEvypEtnI4sSRWkq7CiCV+aD/VyYIzTRK5LN518pMQMF87Y3cWAzl//EzeJre8s74FUz70iy3jvWETWQKBgQDp0KAyXm4doAOt4KgsQ1sHPz/ZM83IfLGO1btDRAP95LYrTrsInABmk1cKbxOkErU7ueWt3XK/kQKCTI9rs+fnaB8L8agPyqWjoMPxvhaqzyUduey4GEQMMbfVUD8l+/TQWBHda5P975OQ8HKV+2/vh94sxyIB+H3Q+otpYpsB5QKBgQCZekgcRuoihw7bA3fFVYxcRH6FFueZX/Mu4ic0RvwpLeJHkdNoUujp6IA7hkMdvVoiveuhZFkZD3Vs52flDSfOHqtpER0GELtdymO0JPDR9wZrSKu115ZkiQ4qw/QKgCX26kMflBOOB4inhvMvKvtlqbB+RDaZb1Anut8AZ4WjSQKBgCSRlpyKHFrRzgGB44uYtUH66HeGHKdAqVyXnQQ2PRGWlc9MLwB3tbBVVwWwvbepnWLL/lolCm9ftK7AXqYPqzOMG1742rotjZ575GmIu27Xmwx9KcLZOLtXg1L/jADa2T1EqPaifrD2qXO/x4whmS4zZ9JFCtKYFMV8ihVfcLLpAoGBAKHTpB8kz2F1MJONeWRTtrp5N5W+fjT7oq8I0CybcelhtDx0AT5vgXWI1klhyvCpDjzK78/BENxxwxUnj86tKN4PxHeArKz3h3n+hR49ZrR4Nm52vYiJsSk8Wf1N/fjGyjEtqZW8e9Kztrykwgohmb1FfhIs+tzwUNbfd2I0rrr8";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmsIZPxJDyrxPwMtw0bGUwvYcFz6v3djDx6ddOQtaswVgsK299JM3e5XIU1S6Bn5qcQRcavmxzD5g3UDxgCuNiunit1dh8hrdrIaD729xrYAW19hmnQsXo3DttxnS/RyuxWmS4k8fHJO9EAVXP0eQ+astqwBTzBOIv3CLHhzXUpxMD4e7k2z7HHgBLWDsWKRkCWsdFHtGFBoBMPadcGrMq48dH7m7fO1StsaPMS9pSNmJNAlmQ/adPN2g626g/10BooEasmtoXXR8m5+Q/MKzFa3H2un/dXQpTFfhkitJjJz1kC9imYBviLYG7J7uTiG7IaJndV3Kl94LoVZNE9yRSQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://139.155.10.106:8080/fore/forebought";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";


	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

