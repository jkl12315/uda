package utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtils{
    /**
     * @return 获取当前17位的毫秒级时间
     */
    public static String getCurrMillTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(date);
    }
    /**
     * @return 获取当前14位的秒级时间
     */
    public static String getCurrTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(date);
    }
    /**
     * @param minute 延后的分钟数
     * @return 当前时间后minute分钟的17位毫秒级时间
     */
    public static String getNextMillTimeByMinute(int minute){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.MINUTE, minute);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return sdf.format(calendar.getTime());
    }
    /**
     * @param time yyyyMMddHHmmss时间字符串
     * @return yyyy-MM-dd HH:mm:ss字符串
     * @throws ParseException
     */
    public static String getDateString(String time) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        Date date=sdf.parse(time);
        SimpleDateFormat sdfNew=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdfNew.format(date);
    }
    /**
     * @param date
     * @return 由2017-11-22 09:20:12得到20171122092012
     * @throws ParseException
     */
    public static String getTimeByDateTime(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date newDate=sdf.parse(date);
        SimpleDateFormat sdfNew=new SimpleDateFormat("yyyyMMddHHmmss");
        return sdfNew.format(newDate);
    }
    /**
     * @param startDate 20171230类似的8位字符串
     * @return 		  获得2017-12-30类似的日期
     * @throws ParseException
     */
    public static String getDateSringByDate(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date newDate=sdf.parse(date);
        SimpleDateFormat sdfNew=new SimpleDateFormat("yyyy-MM-dd");
        return sdfNew.format(newDate);
    }
    /**
     * @param date yyyy-MM-dd日期时间
     * @return yyyyMMdd
     * @throws ParseException
     */
    public static String getNumberStringByDate(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date newDate=sdf.parse(date);
        SimpleDateFormat sdfNew=new SimpleDateFormat("yyyyMMdd");
        return sdfNew.format(newDate);
    }
    /**
     * @param date 2017年11月02日
     * @return 20171102
     * @throws ParseException
     */
    public static String getNumberByDate(String date) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date newDate=sdf.parse(date);
        SimpleDateFormat sdfNew=new SimpleDateFormat("yyyyMMdd");
        return sdfNew.format(newDate);
    }
    /**
     * 获得databaseTime之后，validTimeH小时后的时间
     * @param databaseTime validTimeH
     * @return yyyyMMddHHmmssSSS
     * @throws ParseException
     */
    public static String getNextHours(String databaseTime,int validTimeH) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        Date date=sdf.parse(databaseTime);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, validTimeH);
        return sdf.format(calendar.getTime());
    }
    /**
     * 获得databaseTime之后，codeValidM分钟后的时间
     * @param databaseTime validTimeH
     * @return yyyyMMddHHmmssSSS
     * @throws ParseException
     */
    public static String getNextMinutes(String databaseTime,int codeValidM) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        Date date=sdf.parse(databaseTime);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, codeValidM);
        return sdf.format(calendar.getTime());
    }
	/*public static void main(String [] args) {
		try {
			System.out.println(getNextMinutes("20170102113020345",10));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
    /**
     * 获取datebasetime的1毫秒后的17位毫秒级时间
     * @param datebaseTime
     * @return
     * @throws ParseException
     */
    public static String getNextMill(String datebaseTime) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        Date date=sdf.parse(datebaseTime);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MILLISECOND, 1);
        return sdf.format(calendar.getTime());
    }
}