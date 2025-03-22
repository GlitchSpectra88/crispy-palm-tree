import random
import string

def generate_password(length=12):
    chars = string.ascii_letters + string.digits + "!@#$%^&*()"
    return "".join(random.choice(chars) for _ in range(length))

print("🔑 Generated Password: " + generate_password(16))
