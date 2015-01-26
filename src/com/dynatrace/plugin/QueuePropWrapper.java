package com.dynatrace.plugin;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class QueuePropWrapper {
    
    private int depth,maxDepth,openInputCount,openOutputCount;
    private int msgLength,priorty,persistance,queueType,putAllowed,getAllowed;
    private int inhibitGet, inhibitPut, oldestMsgAge, uncommittedMsgs, enQueueCount, deQueueCount, highQDepth;
    private String  queueName,alterTime,createTime,msgDesc,remoteQM,queueDesc;
    private String  remoteQName,alterationDate,creationDate,TransmissionQueueName;
    private String  lastGetDate, lastGetTime, lastPutDate, lastPutTime;
    private int definitionType;
    private int[] onQTime;

	public int getDefinitionType() {
		return definitionType;
	}

	public void setDefinitionType(int definitionType) {
		this.definitionType = definitionType;
	}

    public int getPersistance() {
		return persistance;
	}

	public void setPersistance(int persistance) {
		this.persistance = persistance;
	}

	public int getInhibitGet() {
		return inhibitGet;
	}

	public void setInhibitGet(int inhibitGet) {
		this.inhibitGet = inhibitGet;
	}

	public int getInhibitPut() {
		return inhibitPut;
	}

	public void setInhibitPut(int inhibitPut) {
		this.inhibitPut = inhibitPut;
	}

	public int getOldestMsgAge() {
		return oldestMsgAge;
	}

	public void setOldestMsgAge(int oldestMsgAge) {
		this.oldestMsgAge = oldestMsgAge;
	}

	public int getUncommittedMsgs() {
		return uncommittedMsgs;
	}

	public void setUncommittedMsgs(int uncommittedMsgs) {
		this.uncommittedMsgs = uncommittedMsgs;
	}

	public int getEnQueueCount() {
		return enQueueCount;
	}

	public void setEnQueueCount(int enQueueCount) {
		this.enQueueCount = enQueueCount;
	}

	public int getDeQueueCount() {
		return deQueueCount;
	}

	public void setDeQueueCount(int deQueueCount) {
		this.deQueueCount = deQueueCount;
	}

	public int getHighQDepth() {
		return highQDepth;
	}

	public void setHighQDepth(int highQDepth) {
		this.highQDepth = highQDepth;
	}

	public int[] getOnQTime() {
		return onQTime;
	}

	public void setOnQTime(int[] onQTime) {
		this.onQTime = onQTime;
	}

	public String getTransmissionQueueName() {
		return TransmissionQueueName;
	}

	public void setTransmissionQueueName(String transmissionQueueName) {
		TransmissionQueueName = transmissionQueueName;
	}

	public String getLastGetDate() {
		return lastGetDate;
	}

	public void setLastGetDate(String lastGetDate) {
		this.lastGetDate = lastGetDate;
	}

	public String getLastGetTime() {
		return lastGetTime;
	}

	public void setLastGetTime(String lastGetTime) {
		this.lastGetTime = lastGetTime;
	}

	public String getLastPutDate() {
		return lastPutDate;
	}

	public void setLastPutDate(String lastPutDate) {
		this.lastPutDate = lastPutDate;
	}

	public String getLastPutTime() {
		return lastPutTime;
	}

	public void setLastPutTime(String lastPutTime) {
		this.lastPutTime = lastPutTime;
	}

	public long getIntervalSinceLastGet(){
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-mm-dd hh.mm.ss");
		long interval = -1;
		try {
			interval = System.currentTimeMillis() - (sdf.parse(lastGetDate + " " + lastGetTime)).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return interval;		
	}
	
	public long getIntervalSinceLastPut(){
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-mm-dd hh.mm.ss");
		long interval = -1;
		try {
			interval = System.currentTimeMillis() - (sdf.parse(lastPutDate + " " + lastPutTime)).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return interval;
	}	
	
	public void setRemoteQName(String remoteQName) {
		this.remoteQName = remoteQName;
	}
	
    /** Creates a new instance of QueuePropWrapper */
    public QueuePropWrapper() {
    }
    
    /** set current depth of the queue
     */
    public void setDepth(int depth){
        this.depth = depth;
    }
    
    /** return current depth of the queue
     */
    public int getDepth(){
        return depth;
    }
    
    public void setMaxDepth(int maxDepth){
        this.maxDepth = maxDepth;
    }
    
    /** return Maximum depth of the queue
     */
    public int getMaxDepth(){
        return maxDepth;
    }
    
    public void setOpenInputCount(int openInputCount){
        this.openInputCount = openInputCount;
    }
    
    /** return openInput Count for
     *the queue
     */
    public int getOpenInputCount(){
        return openInputCount; 
    }
    
    public void setOpenOutputCount(int openOutputCount){
        this.openOutputCount = openOutputCount;
    }
    /** return OpenOutput Count
     */
    public int getOpenOutputCount(){
        return openOutputCount;
    }
    
    public void setMsgLength(int msgLength){
        this.msgLength = msgLength;
    }
    /** return Message length
     */
    public int getMsgLength() {
        return msgLength;
    }
    
    public void setPriorty(int priorty){
       this.priorty = priorty; 
    }
    
    /** return priorty 
     */
    public int getPriorty(){
        return priorty;
    }
    
    public void setPersistence(int persistance){
        this.persistance = persistance;
    }
    
    /** return persistence
     */
    public int getPersistence(){
        return persistance;
    }
    
    public void setQueueType(int queueType){
        this.queueType = queueType;
    }
    
    /** return Queue type
     */
    public int getQueueType(){
        return queueType;
    }
        
    public void setQueueName(String queueName){
        this.queueName = queueName;
    }
    
    /** return Queue name
     */
    public String getQueueName(){
        return queueName;
    }
    
    public void setAlterTime(String alterTime){
        this.alterTime = alterTime;
    }
    
    /** return alter Time for 
     * the queue
     */
    public String getAlterTime(){
        return alterTime;
    }
      
    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }
    /** return create time for the queue
     */ 
    public String getCreateTime(){
        return createTime;
    }
    
    public void setMsgDesc(String msgDesc){
        this.msgDesc = msgDesc;
    }
    
    public String getMsgDesc(){
        return msgDesc;
    }
    
    public void setPutAllowed(int putAllowed){
        this.putAllowed = putAllowed;
    }
    
    /** return true if put allowed false otherwise
     */
    public boolean isPutAllowed(){
       return  putAllowed == 0 ?  true : false;
    }
    
    /** return putallowed value
     */
    public int getPutAllowed(){
       return  putAllowed;
    }
    
    public void setRemoteQM(String remoteQM){
        this.remoteQM = remoteQM;
    }
    /** return remote Queue Manager
     * name
     */
    public String getRemoteQM(){
        return remoteQM;
    }
     
    
     public void setremoteQName(String remoteQName){
        this.remoteQName = remoteQName;
    }
    /** return remote Queue Name
     */
    public String getRemoteQName(){
        return remoteQName;
    }
    
    public void setAlterationDate(String alterationDate){
        this.alterationDate = alterationDate;
    }
    /** return Alteration date
     */
    public String getAlterationDate(){
        return alterationDate;
    }
    
    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }
    
    /** return creation date
     */
    public String getCreationDate(){
        return creationDate;
    }
    
    public void setQueueDesc(String queueDesc){
        this.queueDesc = queueDesc;
    }
    
    public String getQueueDesc(){
        return queueDesc;
    }
    
    public void setGetAllowed(int getAllowed){
        this.getAllowed = getAllowed;
    }
    /* return true if Get allowed or false otherwise
     */ 
    public boolean isGetAllowed(){
       return  getAllowed == 0 ?  true : false;
    }
    
    public int getGetAllowed(){
        return  getAllowed ;
    }
        
    public void setTransQueueName(String TransmissionQueueName){
        this.TransmissionQueueName = TransmissionQueueName;
    }
    /** Return transmission Qeueue 
     *  name 
     */ 
    public String getTransQueueName(){
       return  TransmissionQueueName;
    }
}
