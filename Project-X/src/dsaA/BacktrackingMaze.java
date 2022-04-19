package dsaA;

import java.util.ArrayList;
import java.util.Arrays;

public class BacktrackingMaze {

	public static void main(String[] args) {
		/*
		ArrayList<String> path=new ArrayList<>();
		path=findpathDiag("",3,3);
		System.out.println(path);
		*/
		boolean[][] maze={{true,true,true},
						  {true,false,true},
						  {true,true,true}
						  };
				
							
		stopPath("",maze,0,0);
	}

	static int count(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}
		int left = count(r - 1, c);
		int right = count(r, c - 1);
		return left + right;
	}
	
	

	static void fpath(String p, int r, int c) {
		if(r==1 && c==1) {
			System.out.println(p);
			return;
		}
		if(r>1) {
			fpath(p+'D',r-1,c);
		}
		if(c>1) {
			fpath(p+'R',r,c-1);
		}
		
	}
	
	static ArrayList<String> findPathsAL(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> paths = new ArrayList<String>();
			paths.add(p);

			return paths;
		}

		ArrayList<String> paths = new ArrayList<String>();

		if (r > 1) {
			paths.addAll(findPathsAL(p + 'D', r - 1, c));

		}
		if (c > 1) {
			paths.addAll(findPathsAL(p + 'R', r, c - 1));
		}
		return paths;
	}

	static ArrayList<String> findpathDiag(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> paths = new ArrayList<>();
			paths.add(p);
			return paths;
		}

		ArrayList<String> paths = new ArrayList<>();

		if (r > 1 && c > 1) {
			paths.addAll(findpathDiag(p + 'D', r - 1, c - 1));

		}
		if (r > 1) {
			paths.addAll(findpathDiag(p + 'V', r - 1, c));

		}
		if (c > 1) {
			paths.addAll(findpathDiag(p + 'H', r, c - 1));
		}
		return paths;
	}
	
	static void stopPath(String p,boolean[][] maze, int r, int c) {
		if (r == maze.length-1 && c == maze[0].length-1) {
			
			System.out.println(p);
			return;
		}

		if(maze[r][c]==false) {
			return;
		}
		if (r < maze.length-1 && c < maze[0].length-1) {
			stopPath(p + 'D',maze, r + 1, c + 1);

		}
		if (r < maze.length-1) {
			stopPath(p + 'V',maze, r + 1, c);

		}
		if (c < maze[0].length-1) {
			stopPath(p + 'H',maze, r, c + 1);
		}
		
	}
	
	static void getAllPaths(String p,boolean[][] maze, int r, int c) {
		if (r == maze.length-1 && c == maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		
		maze[r][c]=false;
		
		if (r < maze.length-1) {
			getAllPaths(p + 'D',maze, r + 1, c);

		}
		if (c < maze[0].length-1) {
			getAllPaths(p + 'R',maze, r, c + 1);
		}
		
		if (r > 0) {
			getAllPaths(p + 'U',maze, r-1, c );
		}
		
		if (c > 0) {
			getAllPaths(p + 'L',maze, r, c-1 );
		}
		
		maze[r][c]=true;
	
	}
	
	static void allPathMatrix(String p,boolean[][] maze, int r, int c,int[][] path,int step) {
		if (r == maze.length-1 && c == maze[0].length-1) {
			path[r][c]=step;
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.println();
			return;
		}
		if(maze[r][c]==false) {
			return;
		}
		
		maze[r][c]=false;
		path[r][c]=step;
		
		if (r < maze.length-1) {
			allPathMatrix(p + 'D',maze, r + 1, c,path,step+1);

		}
		if (c < maze[0].length-1) {
			allPathMatrix(p + 'R',maze, r, c + 1,path,step+1);
		}
		
		if (r > 0) {
			allPathMatrix(p + 'U',maze, r-1, c,path,step+1 );
		}
		
		if (c > 0) {
			allPathMatrix(p + 'L',maze, r, c-1,path,step+1 );
		}
		
		maze[r][c]=true;
		path[r][c]=0;
	}
	
}
