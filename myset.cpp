#include <pthread.h>
#include <iostream>
#include <set>

pthread_mutex_t mymutex  = PTHREAD_MUTEX_INITIALIZER;
pthread_mutex_t mymutex2  = PTHREAD_MUTEX_INITIALIZER;
pthread_mutex_t mymutex3  = PTHREAD_MUTEX_INITIALIZER;

int main() {
    std::set<pthread_mutex_t*> myset;

    myset.insert(&mymutex);
    myset.insert(&mymutex2);
    myset.insert(&mymutex3);

    for (std::set<pthread_mutex_t*>::iterator it=myset.begin(); it!=myset.end(); ++it)
        std::cout << ' ' << *it;
    return 0;
}
