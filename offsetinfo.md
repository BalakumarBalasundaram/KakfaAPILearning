sh-4.4$ cd /var/lib/kafka/data/
sh-4.4$ ls
CsvReader-0            __consumer_offsets-21  __consumer_offsets-35  __consumer_offsets-49
__consumer_offsets-0   __consumer_offsets-22  __consumer_offsets-36  __consumer_offsets-5
__consumer_offsets-1   __consumer_offsets-23  __consumer_offsets-37  __consumer_offsets-6
__consumer_offsets-10  __consumer_offsets-24  __consumer_offsets-38  __consumer_offsets-7
__consumer_offsets-11  __consumer_offsets-25  __consumer_offsets-39  __consumer_offsets-8
__consumer_offsets-12  __consumer_offsets-26  __consumer_offsets-4   __consumer_offsets-9
__consumer_offsets-13  __consumer_offsets-27  __consumer_offsets-40  _schemas-0
__consumer_offsets-14  __consumer_offsets-28  __consumer_offsets-41  cleaner-offset-checkpoint
__consumer_offsets-15  __consumer_offsets-29  __consumer_offsets-42  log-start-offset-checkpoint
__consumer_offsets-16  __consumer_offsets-3   __consumer_offsets-43  meta.properties
__consumer_offsets-17  __consumer_offsets-30  __consumer_offsets-44  recovery-point-offset-checkpoint
__consumer_offsets-18  __consumer_offsets-31  __consumer_offsets-45  replication-offset-checkpoint
__consumer_offsets-19  __consumer_offsets-32  __consumer_offsets-46
__consumer_offsets-2   __consumer_offsets-33  __consumer_offsets-47
__consumer_offsets-20  __consumer_offsets-34  __consumer_offsets-48
sh-4.4$ ls -lart
total 232
drwxrwx---  3 appuser root    4096 Jul 15 00:52 ..
-rw-r--r--  1 appuser appuser    0 Oct 21 22:50 .lock
-rw-r--r--  1 appuser appuser    0 Oct 21 22:50 cleaner-offset-checkpoint
-rw-r--r--  1 appuser appuser   90 Oct 21 22:50 meta.properties
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 _schemas-0
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-3
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-18
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-41
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-33
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-10
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-48
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-19
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-34
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-4
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-11
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-26
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-49
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-39
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-9
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-24
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-31
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-46
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-1
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-16
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-2
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-40
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-25
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-47
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-32
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-17
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-37
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-7
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-22
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-29
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-44
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-23
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-14
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-38
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-8
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-45
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-15
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-30
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-35
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-0
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-5
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-20
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-42
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-27
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-12
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-36
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-21
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-6
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-43
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-28
drwxr-xr-x  2 appuser appuser 4096 Oct 21 22:50 __consumer_offsets-13
drwxr-xr-x  2 appuser appuser 4096 Oct 21 23:02 CsvReader-0
-rw-r--r--  1 appuser appuser 1222 Oct 21 23:08 recovery-point-offset-checkpoint
-rw-r--r--  1 appuser appuser    4 Oct 21 23:08 log-start-offset-checkpoint
-rw-r--r--  1 appuser appuser 1225 Oct 21 23:09 replication-offset-checkpoint
drwxrwxr-x 54 appuser root    4096 Oct 21 23:09 .
sh-4.4$ cat recovery-point-offset-checkpoint
0
52
__consumer_offsets 13 0
__consumer_offsets 46 0
__consumer_offsets 9 0
__consumer_offsets 42 0
__consumer_offsets 21 0
__consumer_offsets 17 0
__consumer_offsets 30 0
__consumer_offsets 26 0
__consumer_offsets 5 0
__consumer_offsets 38 0
__consumer_offsets 1 0
__consumer_offsets 34 0
__consumer_offsets 16 0
_schemas 0 0
__consumer_offsets 45 0
__consumer_offsets 12 0
__consumer_offsets 41 0
__consumer_offsets 24 0
__consumer_offsets 20 0
__consumer_offsets 49 0
__consumer_offsets 0 0
__consumer_offsets 29 0
__consumer_offsets 25 0
__consumer_offsets 8 0
__consumer_offsets 37 0
__consumer_offsets 4 0
__consumer_offsets 33 0
__consumer_offsets 15 0
__consumer_offsets 48 0
__consumer_offsets 11 0
__consumer_offsets 44 0
__consumer_offsets 23 0
__consumer_offsets 19 0
__consumer_offsets 32 0
CsvReader 0 0
__consumer_offsets 28 0
__consumer_offsets 7 0
__consumer_offsets 40 0
__consumer_offsets 3 0
__consumer_offsets 36 0
__consumer_offsets 47 0
__consumer_offsets 14 0
__consumer_offsets 43 0
__consumer_offsets 10 0
__consumer_offsets 22 0
__consumer_offsets 18 0
__consumer_offsets 31 0
__consumer_offsets 27 0
__consumer_offsets 39 0
__consumer_offsets 6 0
__consumer_offsets 35 0
__consumer_offsets 2 0
sh-4.4$ cat log-start-offset-checkpoint
0
0
sh-4.4$ cat replication-offset-checkpoint
0
52
__consumer_offsets 29 1
__consumer_offsets 43 0
__consumer_offsets 0 0
__consumer_offsets 6 0
__consumer_offsets 35 0
__consumer_offsets 30 0
__consumer_offsets 13 0
__consumer_offsets 26 0
__consumer_offsets 21 0
__consumer_offsets 19 0
__consumer_offsets 25 0
__consumer_offsets 33 0
__consumer_offsets 41 0
__consumer_offsets 37 0
__consumer_offsets 8 0
__consumer_offsets 24 0
__consumer_offsets 49 0
__consumer_offsets 3 0
__consumer_offsets 40 0
__consumer_offsets 27 0
__consumer_offsets 17 0
__consumer_offsets 32 0
__consumer_offsets 39 0
__consumer_offsets 2 0
__consumer_offsets 44 0
__consumer_offsets 12 0
__consumer_offsets 36 0
__consumer_offsets 45 0
__consumer_offsets 16 0
__consumer_offsets 10 0
__consumer_offsets 11 0
CsvReader 0 3501
_schemas 0 4
__consumer_offsets 20 0
__consumer_offsets 47 0
__consumer_offsets 18 0
__consumer_offsets 7 0
__consumer_offsets 48 0
__consumer_offsets 22 0
__consumer_offsets 46 0
__consumer_offsets 23 0
__consumer_offsets 42 0
__consumer_offsets 28 0
__consumer_offsets 4 0
__consumer_offsets 31 0
__consumer_offsets 5 0
__consumer_offsets 1 0
__consumer_offsets 15 0
__consumer_offsets 38 0
__consumer_offsets 34 0
__consumer_offsets 9 0
__consumer_offsets 14 0
