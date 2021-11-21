#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

int main(){

    int answer=0;
    char *c;
    
    for(int i=0; i<strlen(S)-strlen(pattern); i++){
       
        
        for(int j=i; j<i+strlen(pattern); j++){
            strncpy(c, S+i , strlen(pattern))
        }
        printf("%s\n",c);
        
        int k=0;
        bool visit[strlen(pattern)];
        
        while(true){
            char tmp = pattern[k++];
            bool check = false;
            
            for(int j=0; j<strlen(pattern); j++){
                if(tmp==c[j] && visit[j]==false){
                    visit[j]=true;
                    check = true;
                    break;
                }
            }
            if(check==false){
                break;
            }
            if(k==strlen(pattern)){
                answer++;
                break;
            }
        }  
    }
    return answer;
}