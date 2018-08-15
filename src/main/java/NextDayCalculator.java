public class NextDayCalculator {
    public static void main(String[] args) {

    }

    public static int[] nextDay(int[] date) {
        if (date[2] % 4 == 0) {
            if (date[2] % 100 == 0) {
                if (date[2] % 400 == 0) {
                    if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12) {
                        if (date[0] == 31) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }

                    } else if (date[1] == 2) {
                        if (date[0] == 29) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }
                    } else {
                        if (date[0] == 30) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }
                    }
                } else {
                    if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12) {
                        if (date[0] == 31) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }

                    } else if (date[1] == 2) {
                        if (date[0] == 28) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }
                    } else {
                        if (date[0] == 30) {
                            date[0] = 1;
                            date[1] = date[1] + 1;
                        } else {
                            date[0] = date[0] + 1;
                        }
                    }
                }
            } else {
                if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12) {
                    if (date[0] == 31) {
                        date[0] = 1;
                        date[1] = date[1] + 1;
                    } else {
                        date[0] = date[0] + 1;
                    }

                } else if (date[1] == 2) {
                    if (date[0] == 29) {
                        date[0] = 1;
                        date[1] = date[1] + 1;
                    } else {
                        date[0] = date[0] + 1;
                    }
                } else {
                    if (date[0] == 30) {
                        date[0] = 1;
                        date[1] = date[1] + 1;
                    } else {
                        date[0] = date[0] + 1;
                    }
                }
            }
        } else {
            if (date[1] == 1 || date[1] == 3 || date[1] == 5 || date[1] == 7 || date[1] == 8 || date[1] == 10 || date[1] == 12) {
                if (date[0] == 31) {
                    date[0] = 1;
                    date[1] = date[1] + 1;
                } else {
                    date[0] = date[0] + 1;
                }

            } else if (date[1] == 2) {
                if (date[0] == 28) {
                    date[0] = 1;
                    date[1] = date[1] + 1;
                } else {
                    date[0] = date[0] + 1;
                }
            } else {
                if (date[0] == 30) {
                    date[0] = 1;
                    date[1] = date[1] + 1;
                } else {
                    date[0] = date[0] + 1;
                }
            }
        }


        return date;
    }
}
