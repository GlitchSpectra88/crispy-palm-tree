from pytube import YouTube

url = input("🔗 Enter YouTube video URL: ")
yt = YouTube(url)

print(f"🎥 Downloading: {yt.title}")
yt.streams.get_highest_resolution().download()
print("✅ Download complete!")
