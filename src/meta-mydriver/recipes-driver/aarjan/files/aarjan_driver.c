#include <linux/module.h>

static int __init mydriver_init(void)
{
    printk("[driver] INIT hello from aarjan\n");
    return 0;
}

static void __exit mydriver_exit(void)
{
    printk("[driver] EXIT bye bye from aarjan\n");
}

module_init(mydriver_init);
module_exit(mydriver_exit);
MODULE_LICENSE("GPL");
MODULE_AUTHOR("Aarjan Budathoki");
MODULE_DESCRIPTION("This is a test driver");
MODULE_VERSION("1.0");
