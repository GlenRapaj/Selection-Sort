
public class SelectionSort {
	
	
	public static void SelectionSort( int[] a ) {
		
		int pos ;
		// int min ;
		int n = a.length ;
		
		for( int j = 0 ; j < n - 1 ; j++ ) {
			pos = j ;
			// min = a[j] ;
			
			for( int i = j + 1 ; i < n ; i++ ) {
				if( a[i] < a[pos]) {
					pos = i ;
				}
			}
			
			int temp = a[j] ;
			a[j] = a[pos] ;
			a[pos] = temp ;
			
		}
		
	}

	public static void main(String[] args) {
		int[] a = { 7, 6, 5, 4, 3, 2, 1 } ; 
		SelectionSort( a );
		
		for( int i = 0 ; i < a.length ; i++ ) {
		System.out.println( a[i] );
		}
	}

}
