class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int dr[]={-1,0,1};
        int dc[]={-1,0,1};
        List<List<Integer>> ans=new ArrayList<>();
        boolean[][] g = new boolean[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
                g[i][j]=false;
        }
        for(int[] i:queens)
        {
            g[i[0]][i[1]]=true;
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(dr[i]==0 && dc[j]==0)
                    continue;
                int nx=king[0];
                int ny=king[1];
                while(nx>=0 && nx<8 && ny>=0 && ny<8 && g[nx][ny]==false)
                {
                    nx=nx+dr[i];
                    ny=ny+dc[j];
                }
                if(nx>=0 && nx<8 && ny>=0 && ny<8 && g[nx][ny])
                {
                    ans.add(new ArrayList<>(List.of(nx,ny)));
                }
            }
        }
        return ans;
    }
}