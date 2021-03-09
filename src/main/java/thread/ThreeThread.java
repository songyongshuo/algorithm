//package thread;
//
//import java.util.Scanner;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.ReentrantLock;
//
///**
// * @author songyongshuo
// * @date 2021-03-05 20:27
// */
//public class ThreeThread {
//    private static final ReentrantLock lock = new ReentrantLock();
//    private static final Condition con1 = lock.newCondition();
//    private static final Condition con2 = lock.newCondition();
//    private static final Condition con3 = lock.newCondition();
//
//    private static int count = 0;
//
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread1 = new Thread(() -> {
//            lock.lock();
//
//            try {
//                while (true) {
//                    if (count % 3 == 0) {
//                        System.out.println(Thread.currentThread().getName() + "-A");
//                        Thread.sleep(1000);
//                        con2.signal();
//                        count++;
//                    } else {
//                        con1.await();
//                    }
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            lock.lock();
//
//            try {
//                while (true) {
//                    if (count % 3 == 1) {
//                        System.out.println(Thread.currentThread().getName() + "-L");
//                        Thread.sleep(1000);
//                        con3.signal();
//                        count++;
//                    } else {
//                        con2.await();
//                    }
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//        });
//
//        Thread thread3 = new Thread(() -> {
//            lock.lock();
//
//            try {
//                while (true) {
//                    if (count % 3 == 2) {
//                        System.out.println(Thread.currentThread().getName() + "-I");
//                        Thread.sleep(1000);
//                        con1.signal();
//                        count++;
//                    } else {
//                        con3.await();
//                    }
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } finally {
//                lock.unlock();
//            }
//        });
//
//        thread1.setDaemon(true);
//        thread2.setDaemon(true);
//        thread3.setDaemon(true);
//
//        thread1.start();
//        Thread.sleep(1000);
//        thread2.start();
//        Thread.sleep(1000);
//        thread3.start();
//
////        Scanner scanner = new Scanner(System.in);
////        String input = "";
////        while(input.equals("")) {
////            input = scanner.next();
////        }
//
////        Scanner scan = new Scanner(System.in);
////        String input;
////        do{
////            input = scan.next();
////        }while (input == null);
////        System.out.println("exit");
//    }
//}
