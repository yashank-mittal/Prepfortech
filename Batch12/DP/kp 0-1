int kp(int cap,int wt[],int val[],int n)
{
	map<string,int> mp;
	return maxprofit(wt,val,cap,n,0,mp);
}
int maxprofit(int wt[], int val[],int cap,int n,int cur,map<string,int> mp)
{
	if(curr>=n) return 0;
	
	string currkey=to_string(curr)+"-"+to_string(cap);
	
	if(mp.find(currkey)!=mp.end()) return mp[currkey];
	
	if(wt[curr]<cap) 
	int consider=val[curr]+ maxprofit(wt,val,cap-wt[curr],n,curr+1,mp);
	
	int dontconsider=maxprofit(wt,val,cap,n,curr+1,mp);
	
	mp[currkey]=max(consider,dontconsider);
	return mp[currkey];
}
