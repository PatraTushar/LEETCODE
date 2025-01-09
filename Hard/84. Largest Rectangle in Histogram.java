class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st=new Stack<>();
        int n=heights.length;

    int NSE[]=new int[n];
    int PSE[]=new int[n];

    //calculate NSE

    st.push(n-1);
    NSE[n-1]=n;

    for(int i=n-2;i>=0;i--){

        while(st.size()>0 && heights[i]<=heights[st.peek()]){
            st.pop();
        }

        if(st.size()==0) NSE[i]=n;
        else NSE[i]=st.peek();
        st.push(i);
    }

    //make the stack empty

    while(st.size()>0) st.pop();

    //calculate PSE


    st.push(0);
    PSE[0]=-1;

    for(int i=1;i<n;i++){

        while(st.size()>0 && heights[i]<=heights[st.peek()] ){
            st.pop();
        }

        if(st.size()==0) PSE[i]=-1;

        else PSE[i]=st.peek();


        st.push(i);
    }

    //maximum area of a rectangle

    int max=-1;

    for(int i=0;i<n;i++){

        int area=heights[i]* (NSE[i]-PSE[i]-1);

        if(area>max){
            max=area;
        }
        
    }

    return max;



    
        
    }
}